import axios from "axios";

const API_URL = "/api/v1";

class AuthService {
    async login(userDetails) {
        const response = await axios
            .post(API_URL + "/signin", userDetails);

        if (response.data.token) {
            localStorage.setItem("user", JSON.stringify(response.data));
        }
        return response.data;
    }

    logout() {
        localStorage.removeItem("user");
    }

    /*
      register(username, email, password) {
        return axios.post(API_URL + "signup", {
          username,
          email,
          password
        });
      }
    */
    getCurrentUser() {
        return JSON.parse(localStorage.getItem('user'));
        ;
    }
}

export default new AuthService();
