/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$.post("test.php", {client_id: "admin-cli", password: "123", username: "vasil", grant_type: "password"})
        .done(function (data) {
            alert("Data Loaded: " + data);
        });

