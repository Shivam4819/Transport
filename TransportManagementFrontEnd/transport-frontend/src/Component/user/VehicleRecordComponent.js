import  React ,{useEffect,useState}from "react";
import VehicleRecordService from "../../api/VehicleRecordService";
import {Button, ButtonToggle, Container, Form, FormGroup} from 'reactstrap';
import {Link} from "react-router-dom";
import axios from "axios";


export default function VehicleRecordComponent(){

    const [id,setId]=useState("");
    const [status,setStatus]=useState("");
    const [arr,setArr]= useState([])


    function findbyStatus(){
        axios.post("http://localhost:8080/specific",{
            status:status
        })
            .then(response=> {console.log(response)
                setArr(response.data)
            })
    }

    function findbyId(){
        axios.post("http://localhost:8080/ids",{
            empid:id,
        })
            .then(response=> {console.log(response)
                setArr(response.data)
            })
    }
    return(
        <div>
            <h2>Record</h2>
            <div className="details1">
                Find By Status:<input type="text" name="status" onChange={(event => setStatus(event.target.value))}/>{' '}
                <button onClick={findbyStatus}>Click</button>{' '}
                Find By Id:<input type="number" name="id" onChange={(event => setId(event.target.value))}/>{' '}
                <button onClick={findbyId}>Click</button>

            </div>
            <div className="container">
                <table className="table">
                    <thead>
                    <tr>
                        <th>Vehicle Number</th>
                        <th>Capacity(in tons)</th>
                        <th>Type</th>
                        <th>Status</th>

                    </tr>
                    </thead>
                    <tbody>
                    {
                        arr.map(value => {
                            // console.log(value)
                            return (
                                <tr>
                                    <td>{value.vnumber}</td>
                                    <td>{value.capacity}</td>
                                    <td>{value.type}</td>
                                    <td>{value.status}</td>
                                    {/*<td>{value.empid}</td>*/}
                                    {/*<td><button className="btn btn-warning" >Delete</button></td>*/}
                                </tr>
                            )
                        })
                    }
                    </tbody>
                </table>
                <ButtonToggle outline color="link"><Link to ="/usertask" >Task Manager</Link></ButtonToggle>
            </div>
        </div>
    )
}
