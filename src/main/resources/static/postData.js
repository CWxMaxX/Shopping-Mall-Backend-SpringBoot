const uid = document.getElementById('uid');
const shouUserBtn = document.getElementById('showUser')
const showBtn = document.getElementById("show")
const userContainer = document.getElementById("UserContainer")

const fetchUsers = () => {
    fetch("http://localhost:8080/api/v1/user/getUsers")
        .then(response => response.json())
        .then(json => console.log(json))
        .catch((error) => {
            console.error(error);
        });
}
const fetchUserByUID = (uid) => {
    fetch("http://localhost:8080/api/v1/user/getUser/" + uid)
        .then(response => response.json())
        .then(json => userContainer.innerText = json.name)
        .catch((error) => {
            console.error(error);
        });
}

shouUserBtn.onclick = () => {
    fetchUserByUID(uid.value)
}
showBtn.onclick = () => {
    fetchUsers()
}
//TODO have to implement Spring Security features
//////////////////////////////////////////////////////////////////////////////////////////////
//Create Admin  api

// const adminId = document.getElementById("adminId")
// const email = document.getElementById("email")
// const name = document.getElementById("name")
// const phoneNumber = document.getElementById("phoneNumber")
// const createAdminBtn = document.getElementById("createAdmin")
//
// const saveAdmin = () => {}
//
// createAdminBtn.onclick = () => {
//     saveAdmin()
// }
