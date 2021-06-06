import  React ,{useEffect,useState}from "react";
import VehicleTableService from "../../api/VehicleTableService";
import {Button, ButtonToggle, Container, Form, FormGroup} from 'reactstrap';
import {Link} from "react-router-dom";

export default function VehicleTable(){



    const [arr,setArr]= useState([])

    //
    useEffect(()=>{
        VehicleTableService()
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
                        <th>Vehicle Number</th>
                        <th>Capacity(in tons)</th>
                        <th>Type</th>
                        <th>Status</th>
                        <th>EmpID</th>
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
                                    <td>{value.empid}</td>
                                    {/*<td><button className="btn btn-warning" >Delete</button></td>*/}
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
