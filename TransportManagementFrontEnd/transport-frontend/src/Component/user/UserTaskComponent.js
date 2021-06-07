import  React ,{useState}from "react";
import {Link} from "react-router-dom";
import {Button, Container, Form, FormGroup} from 'reactstrap';

export default function UserTaskComponent(){
    return(
        <div className="App" >
            <h1>Choose the different task from below</h1><br/>
            {/*<p><h2>This application is used only by organization</h2> </p>*/}
            <Button outline color="secondary"><Link to ="/vehiclestatus" >View  Vehicles</Link></Button>{' '}
            <Button outline color="secondary"><Link to ="/vehicletable" >View Vehicle</Link></Button>{' '}
            <Button outline color="secondary"><Link to ="/vehicletable" >Send Vehicle Request</Link></Button>{' '}
        </div>
    )
}
