import logo from './logo.svg';
import './App.css';
 import './Bootstrap.css'
import LoginComponent from "./Component/user/LoginComponent";
import RegisterComponent from "./Component/admin/RegisterComponent";
import ControllerComponent from "./Component/ControllerComponent";
import UserRecordTableComponent from "./Component/admin/UserRecordTableComponent";
function App() {
  return (
    <div>
        {/*<UserRecordTableComponent/>*/}
        <ControllerComponent/>
      {/*<h1>ssfsdjffs</h1>*/}
      {/*  <LoginComponent/>*/}
        {/*<RegisterComponent/>*/}

    </div>
  );
}

export default App;
