import './App.css';
import React, {Component} from 'react';
import {BrowserRouter as Router, Link, Route, Switch} from 'react-router-dom';
import CreateVehicleComponent from './components/Vehicle/CreateVehicleComponent';
import ListVehicleComponents from './components/Vehicle/ListVehicleComponents';
import ViewVehicleComponent from './components/Vehicle/ViewVehicleComponent';
import ViewVehicleLogComponent from './components/VehicleReservation/ViewVehicleLogComponent';
import ViewParkingStallComponent from './components/ParkingStall/ViewParkingStallComponent';
import ViewCRLocationForComponent from './components/VehicleRentalLocation/ViewCRLocationForVehicleComponent';
import ListVehicleOfCRLocationComponents from './components/VehicleRentalLocation/ListVehicleOfCRlLocationComponents';
import ListCRLocationComponents from './components/VehicleRentalLocation/ListCRLocationComponents';
import ViewCRSystemComponent from './components/VehicleRentalSystem/ViewCRSystemComponent';
import ViewAllAccountsViaAdmin from './components/Account/ViewAllAccountsViaAdmin';
import ViewPersonalInfoAccount from './components/Account/ViewPersonalInfoAccount';
import ViewReservationAccount from './components/VehicleReservation/ViewReservationAccount';
import ListVehicleReservationsAll from './components/VehicleReservation/ListVehicleReservationsAll';
import ListVehicleReservationPerCRLocation from './components/VehicleReservation/ListVehicleReservationPerCRLocation';
import CreateAccountMember from './components/Account/CreateAccountMember';
import CreateCRLocation from './components/VehicleRentalLocation/CreateCRLocation';
import CreateVehicleReservation from './components/VehicleReservation/CreateVehicleReservation';
import ViewBillComponentVRID from './components/Bill/ViewBillComponentsVRID';
import ViewBillItem from './components/Bill/ViewBillItem';
import CreateAccountReceptionist from './components/Account/CreateAccountReceptionist';
import Home from './components/Common/Home';
import CreateVehicleLogComponent from './components/VehicleRentalSystem/CreateVehicleLog';
import AuthService from './services/auth.service';
import SLogin from './components/securityComponents/login.component';
import Profile from './components/securityComponents/profile.component';
import BoardAdmin from './components/securityComponents/board-admin.component';
import BoardUser from './components/securityComponents/board-user.component';
import Register from './components/securityComponents/register.component';
import EventBus from './common/EventBus';
import UpdateVehicleLog from './components/Vehicle/UpdateVehicleLog';
import Logo from "./icons/logo.svg";


import error from './components/Common/error';
import ForgotPassword from './components/Common/ForgotPassword'
import ViewPricing from './components/Pricing/ViewPricing';
import Catalog from './components/Pages/Catalog';
import AboutUs from './components/Pages/AboutUs';
import {NikeCard} from './components/Pages/NikeCard';
import Frontpage from "./components/securityComponents/frontpage";

class App extends Component {
    constructor(props) {
        super(props);
        this.logOut = this.logOut.bind(this);

        this.state = {
            showAdminBoard: false,
            showUserBoard: false,
            currentUser: undefined,
        };
    }

    componentDidMount() {
        const user = AuthService.getCurrentUser();
        if (user) {
            this.setState({
                currentUser: user
            });

            if (user.roles === "ROLE_ADMIN") {
                this.setState({
                    showAdminBoard: true,
                })
            }
            if (user.roles === "ROLE_USER") {
                this.setState({
                    showUserBoard: true
                });
            }
        }
        EventBus.on("logout", () => {
            this.logOut();
        });
    }


    componentWillUnmount() {
        EventBus.remove("logout");
    }

    logOut() {
        AuthService.logout();
        this.setState({
            showAdminBoard: false,
            showUserBoard: false,
            currentUser: undefined,
        });
    }


    render() {

        const {currentUser, showAdminBoard, showUserBoard} = this.state;

        return (
            <div>
                <Router>
                    <nav className="navbar navbar-expand navbar-light bg-light ">
                        <Link to={"/home"} className="navbar-brand">
                            <img src={Logo} alt="Helping Hand" style={{width: "100px"}}/>
                        </Link>
                        <div className="navbar-nav mr-auto">
                            <li className="nav-item">
                                <Link to={"/home"} className="nav-link">
                                    <b>Home</b>
                                </Link>
                            </li>


                            {showAdminBoard && (
                                <li className="nav-item">
                                    <Link to={"/admin"} className="nav-link">
                                        <b>Admin Board</b>
                                    </Link>
                                </li>
                            )}


                            {showUserBoard && (
                                <li className="nav-item">
                                    <Link to={"/user"} className="nav-link">
                                        <b>User</b>
                                    </Link>
                                </li>
                            )}


                            <li className="nav-item">
                                <Link to={"/ViewPricing"} className="nav-link">
                                    <b>Pricing</b>
                                </Link>
                            </li>

                            <li className="nav-item">
                                <Link to={"/viewCar"} className="nav-link">
                                    <b>View Catalog</b>
                                </Link>
                            </li>


                            <li className="nav-item">
                                <Link to={"/aboutUs"} className="nav-link">
                                    <b>About</b>
                                </Link>
                            </li>
                        </div>

                        {currentUser ? (
                            <div className="navbar-nav ml-auto">

                                {showAdminBoard && (
                                    <li className="nav-item">
                                        <Link to={"/account/register/admin"} className="nav-link">
                                            <b>Register Admin</b>
                                        </Link>
                                    </li>
                                )}


                                <li className="nav-item">
                                    <Link to={"/profile"} className="nav-link">
                                        <b>Profile</b>
                                    </Link>
                                </li>

                                <li className="nav-item">
                                    <Link to={"/frontpage"} className="nav-link">
                                        <b>How it Works?</b>
                                    </Link>
                                </li>

                                <li className="nav-item">
                                    <a href="/home" className="nav-link" onClick={this.logOut}>
                                        <b>LogOut</b>
                                    </a>
                                </li>
                            </div>
                        ) : (
                            <div className="navbar-nav ml-auto">
                                <li className="nav-item">
                                    <Link to={"/login"} className="nav-link">
                                        <b>Login</b>
                                    </Link>
                                </li>

                                <li className="nav-item">
                                    <Link to={"/account/register/member"} className="nav-link">
                                        <b>Sign Up</b>
                                    </Link>
                                </li>

                                <li className="nav-item">
                                    <Link to={"/frontpage"} className="nav-link">
                                        <b>How it Works?</b>
                                    </Link>
                                </li>

                            </div>


                        )}


                    </nav>

                    <div className="container">
                        <Switch>
                            <Route exact path="/" component={Home}/>
                            <Route exact path="/frontpage" component={Frontpage}/>

                            <Route exact path="/login" component={SLogin}/>
                            <Route exact path="/register" component={Register}/>
                            <Route exact path="/profile" component={Profile}/>
                            <Route exact path="/user" component={BoardUser}/>
                            <Route exact path="/admin" component={BoardAdmin}/>
                            {
                                //above are /api/test
                            }
                            <Route path="/vehicle/add" component={CreateVehicleComponent}/>
                            <Route path="/vehicle/view" exact component={ListVehicleComponents}/>
                            <Route path="/vehicle/view/:id" component={ViewVehicleComponent}/>
                            <Route path="/logs/vehicle/view/:id" component={ViewVehicleLogComponent}/>
                            <Route path="/parkingstall/vehicle/view/:id" component={ViewParkingStallComponent}/>
                            <Route path="/carrentallocation/vehicle/view/:id" component={ViewCRLocationForComponent}/>
                            <Route path="/carrentallocation/:id/vehicles"
                                   component={ListVehicleOfCRLocationComponents}/>
                            <Route path="/carrentallocations/view" component={ListCRLocationComponents}/>
                            <Route path="/home/system" component={ViewCRSystemComponent}/>
                            <Route path="/admin/account/view/all" component={ViewAllAccountsViaAdmin}/>
                            <Route path="/account/view/pinfo/:id" component={ViewPersonalInfoAccount}/>
                            <Route path="/vehiclereservation/account/view/:id" component={ViewReservationAccount}/>
                            <Route path="/admin/vehiclereservations/view/all" component={ListVehicleReservationsAll}/>
                            <Route path="/admin/vehiclereservation/carrentallocation/view/vehicle/:id"
                                   component={ListVehicleReservationPerCRLocation}/>
                            <Route path="/account/register/member" component={CreateAccountMember}/>
                            <Route path="/admin/carrentallocation/add" component={CreateCRLocation}/>
                            <Route path="/createvehiclereservation/" component={CreateVehicleReservation}/>
                            <Route path="/vehiclereservation/viewbill/:id" component={ViewBillComponentVRID}/>
                            <Route path="/vehiclereservation/viewbillItem/:id/detailedview/" component={ViewBillItem}/>
                            <Route path="/account/register/admin" component={CreateAccountReceptionist}/>
                            <Route path="/home" component={Home}/>
                            <Route path="/vehicle/:id/createvehiclelog" component={CreateVehicleLogComponent}/>

                            <Route path="/forgotPassword" component={ForgotPassword}/>
                            <Route path="/updateVehicleLog/:id" component={UpdateVehicleLog}/>
                            <Route exact path="/ViewPricing" component={ViewPricing}/>
                            <Route path="/viewCar" component={Catalog}/>
                            <Route path="/aboutUs" component={AboutUs}/>
                            <Route path="/nike" component={NikeCard}/>

                            <Route component={error}/>
                            <Route/>
                        </Switch>
                    </div>
                    {/*<FooterComponents/>*/}
                </Router>
            </div>

        );
    }
}

export default App;

//<Route path="/update-employee/:id" component={UpdateEmployeeComponent}/>