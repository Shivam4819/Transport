import React,{useState}from "react";
import axios from "axios";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import {Button, ButtonToggle, Container, Form, FormGroup} from 'reactstrap';
import {Link} from "react-router-dom";


export default function VehicleRegistration( ) {
    const [vnumber,setVnumber]=useState("");
    const [capacity,setCapacity]=useState("");
    const [type,setType]=useState("");
    const [status,setStatus]=useState("");
    const [empid,setempid]=useState("");


    function displayall(){
        console.log(vnumber);
        console.log(capacity);
        console.log(type);
        console.log(status);
        console.log(empid);

    }

    function sendVehicleDetails(){
        axios.post("http://localhost:8080/vehicles",{
            vnumber:vnumber,
            capacity:capacity,
            type:type,
            status:status,
            empid:empid
        }).then((response)=>{

            if(response.data==="success"){
                toast.success("vehicle registered");

            }
            else {
                toast.error("wrong input");
            }
        })

    }
    return(
        <Container className="forms">
            <Form>
                <h1> Type Details of new vehicle</h1><br/>

                <FormGroup>
                    <label>Vehicle Number:</label><input type="number" name="vnumber"  onChange={(event => setVnumber(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>
                    <label>Capacity:</label><input type="number" name= "capacity" onChange={(event => setCapacity(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>
                    <label>Vehicle Type:</label><input type="text" name="type" onChange={(event => setType(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>
                    <label>Status:</label><input type="text" name="status" onChange={(event => setStatus(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>
                    <label>EmpID:</label><input type="number" name="empid" onChange={(event => setempid(event.target.value))}/><br/>
                </FormGroup>

                <FormGroup>
                    {/*<ButtonToggle color="primary" size="lg"  onClick={displayall}>display</ButtonToggle>{' '}*/}
                    <ButtonToggle color="primary" size="lg"  onClick={sendVehicleDetails}>Register Vehicle</ButtonToggle>{' '}
                    <ToastContainer
                        position="bottom-right"/>
                    <ButtonToggle outline color="link"><Link to ="/admintask" >Task Manager</Link></ButtonToggle>
                </FormGroup>
            </Form>
        </Container>
    );
}
