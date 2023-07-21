import React, {Component} from "react";
import {Link} from 'react-router-dom';
import Card from 'react-bootstrap/Card';
import CardGroup from 'react-bootstrap/CardGroup';
import Container from 'react-bootstrap/Container';
import Col from 'react-bootstrap/Col';
import Row from 'react-bootstrap/Row';
import Contact from "../../icons/contact_illustration.svg";
import VehicleImg from "../../icons/cars-silhouette.png";
import Join from "../../icons/join_illustration.svg";
import World from "../../icons/world_illustration.svg";

export default class FrontPage extends Component {
    render() {
        return (
            <div>
                <Container id="hero" className="text-center">
                    <Row>
                        <Col className="hero-content d-inline-block m-4">
                            <br></br>
                            <br></br>
                            <br></br>
                            <h1 id="home-headline" style={{textShadow: '2px 2px'}}>Turbo</h1>
                            <p>We're India's newest Vehicle Rental Solution.<br></br> Small or big, you can Rent any
                                type of Vehicle.</p>
                        </Col>
                        <Col>
                            <img className="d-inline-block" src={VehicleImg} alt="hand shake"
                                 style={{width: '500px', height: 'auto'}}></img>
                        </Col>
                    </Row>
                </Container>

                <section id="features" className="background-shape spaceTop bold">
                    <div className="features-content text-center mb-4">
                        <h1 className="pb-4 white bold">Become a <span className="orange">Member</span></h1>
                        <div className="arrow-up"></div>
                        <CardGroup className="text-center spacing">
                            <Card className="feature shadow-border spacing rounded mb-4">
                                <Card.Body>
                                    <Card.Img src={Contact} alt="Contact" style={{maxWidth: "180px", height: "190px"}}/>
                                    <Card.Title className="orange ">Set up your Account</Card.Title>
                                    <Card.Text>Join Turbo today to rent a Vehicle. Set up your account to view the
                                        vehicle catalog and track your Reservations.</Card.Text>
                                </Card.Body>
                            </Card>
                            <Card className="feature shadow-border spacing rounded mb-4">
                                <Card.Body>
                                    <Card.Img src={World} alt="Contact" style={{maxWidth: "160px", height: "190px"}}/>
                                    <Card.Title className="orange ">Create a Reservation</Card.Title>
                                    <Card.Text>Contribute to the community by Creating Vehicle Reservations. Pick the
                                        one you like, whether it is a Car, Van, or a Truck.</Card.Text>
                                </Card.Body>
                            </Card>
                            <Card className="feature shadow-border spacing rounded mb-4">
                                <Card.Body>
                                    <Card.Img src={Join} alt="Contact" style={{maxWidth: "120px", height: "190px"}}/>
                                    <Card.Title className="orange ">Pick up the Vehicle</Card.Title>
                                    <Card.Text>By creating the reservation, you can Check-out your allocated vehicle on
                                        the creation date of your Reservation</Card.Text>
                                </Card.Body>
                            </Card>
                        </CardGroup>
                        <button className="button mb-4" style={{width: '250px'}}><Link to="/account/register/member"
                                                                                       style={{color: 'black'}}><b>Join
                            Now</b></Link></button>
                    </div>
                </section>

                <footer>
                </footer>
            </div>
        );
    }
}
