import  React ,{useEffect,useState}from "react";
import VehicleRequestService from "../../api/VehicleRequestService";
import {Button, ButtonToggle, Container, Form, FormGroup} from 'reactstrap';
import {Link} from "react-router-dom";
import axios from "axios";
import {toast} from "react-toastify";

export default function VehicleRequestComponent(){



    const [arr,setArr]= useState([])

    function accept(vnumber,empid){
        axios.put("http://localhost:8080/updatestatus",{
            vnumber:vnumber,
            empid:empid
        }).then((response)=>{
            console.log(response.data)
        })
    }

    function decline(vnumber,empid){
        axios.put("http://localhost:8080/reqdec",{
            vnumber:vnumber,
            empid:empid
        }).then((response)=>{
            console.log(response.data)
        })
    }
    useEffect(()=>{
        VehicleRequestService()
            .then(response=> {console.log(response)
                setArr(response.data)
            })
    },[])



    return(
        <div>
            <h2>Record</h2>

            <div className="container">
                <table className="table">
                    <thead>
                    <tr>
                        <th>Vehicle No.</th>
                        <th>EmpId</th>
                        <th>Capacity</th>
                        <th>Type</th>
                        {/*<th>Accept</th>*/}
                        {/*<th>Decline</th>*/}
                    </tr>
                    </thead>
                    <tbody>
                    {
                        arr.map(value => {
                            // console.log(value)
                            return (
                                <tr>
                                    <td>{value.vnumber}</td>
                                    <td>{value.empid}</td>
                                    <td>{value.capacity}</td>
                                    <td>{value.type}</td>
                                    <td><button className="btn btn-success" onClick={() =>accept(value.vnumber,value.empid)}>Accept</button></td>
                                    <td><button className="btn btn-danger" onClick={() =>decline(value.vnumber,value.empid)}>Decline</button></td>
                                </tr>
                            )
                        })
                    }
                    </tbody>
                </table>
                <ButtonToggle outline color="link"><Link to ="/admintask" >Task Manager</Link></ButtonToggle>
            </div>
        </div>
    )
}
