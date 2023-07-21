import React from 'react';
import '../../css/loginStyle.css';
import login from '../../video/login.mp4';

export default function Home() {
    return (
        <div>
            <div style={{
                height: "100vh",
                width: "100vw",
                objectFit: "cover",
                position: "relative",
                pointerEvents: "none",
            }}>
                <video autoPlay loop playsInline muted>
                    <source
                        src={login}
                        type='video/mp4'
                    />
                </video>
                <h2 style={{
                    position: "absolute",
                    top: "50%",
                    left: "50%",
                    transform: "translate(-50%, -50%)",
                    color: "white",
                    textShadow: "2px 2px black"
                }}>
                    Own the Experience
                </h2>
                <div style={{
                    color: "black",
                    position: "relative",
                    marginTop: "50px",
                    fontFamily: 'Varela Round',
                }}>
                    <div>
                        <h1 style={{color: 'white', textShadow: '1px 2px'}}>Own the experience,<br></br>not the ride
                        </h1>
                        <p style={{color: 'white', textShadow: '1px 1px'}}>Rent Vehicles Around you</p>
                    </div>
                </div>
            </div>
        </div>
    );
}

