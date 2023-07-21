import React, {Component} from 'react';

class AboutUs extends Component {

    render() {
        return (
            <div style={{}}>
                <br></br>


                <div className="about-section">
                    <div className='card' style={{backgroundColor: 'purple', boxShadow: '10px 10px'}}>
                        <h1 style={{color: 'white', textShadow: '1px 2px'}}>About Us: :</h1>
                    </div>
                    <br></br>
                    <div className='card' style={{backgroundColor: 'white', boxShadow: '1px 1px'}}>
                        <p style={{textAlign: 'justify'}}>
                            Turbo, India's newest car rental solution, emerged in 2022 and operates in 150+ cities
                            nationwide, making it the dominant player in the car-rental market. Founded by Gursimran
                            Singh, Turbo began as an internship project and quickly gained momentum, igniting the
                            entrepreneurial spirit of its founder. Since then, Turbo has garnered numerous industry
                            awards and continues to aspire for greater achievements. Our primary goal is to meet the car
                            rental requirements of all Indians, and we eagerly anticipate the opportunity to serve you.
                        </p>
                    </div>
                </div>
                <br></br>
                <div className='card' style={{backgroundColor: 'purple', boxShadow: '10px 10px'}}>
                    <h2 style={{align: 'center', textShadow: '1px 2px', color: 'white'}}>Our Team:</h2>
                </div>
                <div className="row">
                    <div className="column">
                        <div className="card" style={{boxShadow: '4px 3px 4px 0px'}}>
                            <img src="/Images/Gursimran.jpg" alt="Gursimran"
                                 style={{width: '100%', objectFit: 'cover'}}/>
                            <div className="container">
                                <h5 style={{textAlign: 'center'}}>Gursimran Singh</h5>
                                <p style={{textAlign: 'center'}}>Thapar Institute Of Engineering And Technology</p>
                                <p style={{textAlign: 'center'}}>Analyst Intern</p>
                                <p style={{textAlign: 'center'}}>gsingh3_be18@thapar.edu</p>
                                <p style={{textAlign: 'center'}}>
                                    <button className="button">Contact</button>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );

    }

}

export default AboutUs;