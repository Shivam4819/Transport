import React,{useState}from "react";
import axios from "axios";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import {ButtonToggle, Container, Form, FormGroup} from 'reactstrap';


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

            if(response.data==="success"){
                toast.success("registration successful");
                toast.info("go to login")
            }
            else {
                toast.error("wrong input");
            }
        })

    }
    return(
        <Container className="forms">
            <Form>
                <FormGroup>
                    ID:<input type="number" name="id"  onChange={(event => setId(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>
                     Name:<input type="text" name= "name" onChange={(event => setName(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>
                    Username:<input type="text" name="username" onChange={(event => setUsername(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>
                     Password:<input type="text" name="password" onChange={(event => setPassword(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>
                     Designation:<input type="text" name="designation" onChange={(event => setDesignation(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>
                    <ButtonToggle color="primary" size="md" onClick={displayall}>Display </ButtonToggle>{'   '}
                    <ButtonToggle color="primary" size="md" onClick={sendUserValueToServer}>Register </ButtonToggle>{' '}
                    <ToastContainer
                        position="bottom-right"/>
                </FormGroup>
            </Form>
        </Container>
    );
}
