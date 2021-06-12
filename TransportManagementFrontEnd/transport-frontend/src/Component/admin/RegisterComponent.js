import React,{useState}from "react";
import axios from "axios";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import {Button, ButtonToggle, Container, Form, FormGroup} from 'reactstrap';
import {Link} from "react-router-dom";


export default function RegisterComponent( ) {
    const [id,setId]=useState("");
    const [name,setName]=useState("");
    const [username,setUsername]=useState("");
    const [password,setPassword]=useState("");
    const [designation,setDesignation]= useState("");


    function displayall(){
        console.log(id);
        console.log(name);
        console.log(username);
        console.log(password);
        console.log(designation);
    }

    function sendUserValueToServer(){
        axios.post("http://localhost:8080/register",{
            id: id,
            name: name,
            username: username,
            password: password,
            designation : designation
        }).then((response)=>{
            console.log(response.data)
            if(response.data.responseMsg==="done"){
                toast.success("registration successful");
            }
            else {
                toast.error("wrong input");
            }
        })

    }
    return(
        <Container className="forms">
            <Form>
                <h1> Type Details of new employees</h1><br/>

                <FormGroup>
                    <label>ID:</label><input type="number" name="id"  onChange={(event => setId(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>
                    <label>Name:</label><input type="text" name= "name" onChange={(event => setName(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>
                    <label>Username:</label><input type="text" name="username" onChange={(event => setUsername(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>
                    <label>Password:</label><input type="text" name="password" onChange={(event => setPassword(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>
                    <label>Designation:</label><input type="text" name="designation" onChange={(event => setDesignation(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>

                    {/*<ButtonToggle color="primary" size="md" onClick={displayall}>Display </ButtonToggle>{'   '}*/}
                    <ButtonToggle color="primary" size="lg"  onClick={sendUserValueToServer}>Register </ButtonToggle>{' '}
                    <ToastContainer
                        position="bottom-right"/>
                    <ButtonToggle outline color="link"><Link to ="/admintask" >Task Manager</Link></ButtonToggle>
                </FormGroup>
            </Form>
        </Container>
    );
}
