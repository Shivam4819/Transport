import logo from './logo.svg';
import './App.css';
 import './Bootstrap.css'
import LoginComponent from "./Component/user/LoginComponent";
import RegisterComponent from "./Component/admin/RegisterComponent";
import ControllerComponent from "./Component/ControllerComponent";
import UserTable from "./Component/admin/UserTable";
function App() {
  return (
    <div>
        {/*<UserTable/>*/}
        <ControllerComponent/>
      {/*<h1>ssfsdjffs</h1>*/}
      {/*  <LoginComponent/>*/}
        {/*<RegisterComponent/>*/}

    </div>
  );
}

export default App;
