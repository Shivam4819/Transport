import  React ,{useState}from "react";
import {Link} from "react-router-dom";
import {Button, Container, Form, FormGroup} from 'reactstrap';

export default function AdminTaskComponent(){
    return(
        <div className="App" >
            <h1>Choose the different task from below</h1><br/>
            {/*<p><h2>This application is used only by organization</h2> </p>*/}
            <Button outline color="secondary"><Link to ="/register" >Register User</Link></Button>{' '}
            <Button outline color="secondary"><Link to ="/usertable" >View Users Record</Link></Button>{' '}
            <Button outline color="secondary"><Link to ="/vehicledetail" >Register Vehicle</Link></Button>{' '}
            <Button outline color="secondary"><Link to ="/vehicletable" >View All Vehicle</Link></Button>{' '}
            <Button outline color="secondary"><Link to ="/vehiclereq" >New Vehicle Request</Link></Button>{' '}

        </div>
    )
}
