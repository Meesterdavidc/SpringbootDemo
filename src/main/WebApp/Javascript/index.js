let button= document.getElementById("button")

button.addEventListener('click', async() => {

try{
    const raw_response=await fetch(`http://localhost:8080/app/candies`)

    if(!raw_response.ok){
        throw new Error(raw_response.status)

    }
    const json_data= await raw_response.json();

    console.log(json_data)

    var input= document.getElementById("input");

    input.innerText=`My Favorite candy is ${json_data[0].name} and it can be found at ${json_data[0].shop.shopName}. It goes for ${json_data[0].price} dollars`;
}catch(error){
    console.log(error)
}
})