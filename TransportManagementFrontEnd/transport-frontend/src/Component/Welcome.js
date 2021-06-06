import  React ,{useState}from "react";
import {Link} from "react-router-dom";
import {Button, Container, Form, FormGroup} from 'reactstrap';

export default function Welcome(){
    return(
        <div className="App" >
            <h1>Welcome to Transport Management Application</h1><br/>
            <p><h2>This application is used only by organization</h2> </p>
            <Button outline color="secondary"><Link to ="/adminLogin" >Login As Admin</Link></Button>{' '}
            <Button outline color="secondary"><Link to ="/login" >Login As User</Link></Button>

        </div>
    )
}
