import React ,{useState}from 'react'
import axios from "axios";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import {ButtonToggle, Container, Form, FormGroup} from 'reactstrap';

export default function LoginComponent(props){
    const [username,setUser]=useState("");
    const [password,setPass]=useState("");
    const [res,setRes]=useState("");
    function display(){

        console.log(username);
        console.log(password);
    }
    function sendtoSpring(){
        axios.post("http://localhost:8080/loginuser",{
            username: username,
            password: password

        }).then((response)=>{
                console.log(response)
         //   result=response.data.msg;
             setRes(response.data.msg)
            if(response.data.msg==="done"){
                props.history.push("/usertask")

            }
            else {
                toast.error("check credential");
            }
        })
    }

    const notify = () => toast.success("Wow so easy!");

    return(
        <Container className="forms">
            <Form >
                <h1>Login for User</h1>
                <FormGroup>
                    Username:<input type="text" name="username" placeholder="username" onChange={(event => setUser(event.target.value))}/><br/>
                </FormGroup>
                <FormGroup>
                    Password:<input type="text" name="password" placeholder="password" onChange={(event => setPass(event.target.value))}/><br/>
                </FormGroup>
                    <FormGroup>
                    <ButtonToggle color="primary" size="md" onClick={display}>Display </ButtonToggle>{'   '}
                    <ButtonToggle color="primary" size="md" onClick={sendtoSpring}>Login </ButtonToggle>{' '}
                    {/*<ButtonToggle color="primary" size="md" onClick={notify}>Toast </ButtonToggle>{' '}*/}
                    <ToastContainer
                        position="bottom-right"
                        autoClose={2000}
                    />
                    </FormGroup>

            </Form>
        </Container>

    )
}
