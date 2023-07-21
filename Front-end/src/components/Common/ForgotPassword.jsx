import React, { useState } from 'react';
import LoginServices from '../../services/LoginServices';
import { useHistory } from "react-router-dom";

function ForgotPassword() {
    const history = useHistory();
    const [email, setEmail] = useState('');
    const [driverLicense, setDriverLicense] = useState('');
    const [password, setPassword] = useState('');
    const [confirmPassword, setConfirmPassword] = useState('');

    const saveNewPassword = (e) => {
        e.preventDefault();
        if (password === confirmPassword) {
            let newPass = { email: email, driverLicense: driverLicense, password: password, confirmPassword: confirmPassword };
            console.log('newPass=> ' + JSON.stringify(newPass));
            LoginServices.forgotPassword(newPass).then(res => {
                history.push(`/profile`);
            });
        } else {
            alert("Both Passwords do not match");
        }
    }

    return (
        <div className="card col-md-5 offset-md-3 my-5" style={{ margin: 'auto' }}>
            <h1>Forgot Password</h1>
            <br />

            <label>Email Address:</label>
            <div className='form-group'>
                <input type="email" placeholder="someone@email.com" name="email" onChange={e => setEmail(e.target.value)} value={email} />
            </div>

            <label>Driver Licence:</label>
            <div className='form-group'>
                <input type="text" placeholder="Driver Licence" name="driverLicense" onChange={e => setDriverLicense(e.target.value)} value={driverLicense} />
            </div>

            <label>Enter New Password:</label>
            <div className='form-group'>
                <input type="password" placeholder="enter new password" name="password" onChange={e => setPassword(e.target.value)} value={password} />
            </div>

            <label>Confirm New Password:</label>
            <div className='form-group'>
                <input type="password" placeholder="confirm password" name="confirmPassword" onChange={e => setConfirmPassword(e.target.value)} value={confirmPassword} />
            </div>

            <div>
                <button className='btn-dark' onClick={saveNewPassword}>Submit</button>
            </div>

            <br />
        </div>
    )
}

export default ForgotPassword;