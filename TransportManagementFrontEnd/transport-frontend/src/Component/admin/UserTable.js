import  React ,{useEffect,useState}from "react";
import UserTableService from "../../api/UserTableService";
import {Button, ButtonToggle, Container, Form, FormGroup} from 'reactstrap';
import {Link} from "react-router-dom";

export default function UserTable(){



    const [arr,setArr]= useState([])

    //
    useEffect(()=>{
        UserTableService()
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
                        <th>ID</th>
                        <th>Name</th>
                        <th>Designation</th>
                    </tr>
                    </thead>
                    <tbody>
                    {
                        arr.map(value => {
                            // console.log(value)
                            return (
                                <tr>
                                    <td>{value.id}</td>
                                    <td>{value.name}</td>
                                    <td>{value.designation}</td>
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
