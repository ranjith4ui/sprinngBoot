<html>   
<head>  
<title> User Page </title>  
<style>   
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: pink;  
}  
button {   
       background-color: #4CAF50;   
       width: 100%;  
        color: orange;   
        padding: 15px;   
        margin: 10px 0px;   
        border: none;   
        cursor: pointer;   
         }   
 form {   
        border: 3px solid #f1f1f1;   
    }   
 input[type=text], input[type=password] {   
        width: 100%;   
        margin: 8px 0;  
        padding: 12px 20px;   
        display: inline-block;   
        border: 2px solid green;   
        box-sizing: border-box;   
    }  
 button:hover {   
        opacity: 0.7;   
    }   
  .cancelbtn {   
        width: auto;   
        padding: 10px 18px;  
        margin: 10px 5px;  
    }   
        
     
 .container {   
        padding: 25px;   
        background-color: lightblue;  
    }   
</style>   
</head>    
<body>    
    <h1> To be updated: ${user} </h1> 
      
   <form action="addUser" method="post">  
        <div class="container">   
            <label>Employee Id : </label>   
            <input type="text" placeholder="Enter Username" name="id" required>  
            <label>Employee : </label>   
            <input type="text" placeholder="Enter Password" name="name" required>  
            <button type="submit">Submit</button>   
            <button type="button" class="cancelbtn"> Cancel</button>
        </div> 
        </form>
</body>     
</html>  