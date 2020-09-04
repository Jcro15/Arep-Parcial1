var api = (function () {

    function calculateStatistics (){
        var url='http://localhost:4567/calcular';
        //var url='https://whispering-lake-79074.herokuapp.com/calcular';
        var data=document.getElementById("data").value;
        $("#TData > tbody").empty();
        $("#mean").empty();
        $("#sum").empty();
        axios.post(url,data)
            .then(res => {
                let json = JSON.parse(res.data);
                console.log(json)
                $("#mean").text("Media : "+json.media);
                $("#sum").text("Suma : "+json.sum);
                putData(json.list)

            }
        )
    }

    function putData(data){
        data=data.substr(1,data.length-2)
        data=data.split(",")
        for(i=0;i<data.length;i++){
            $("#TData > tbody").append(
                "<tr>" +
                " <td>" + (i+1) + "</td>" +
                "<td>" + data[i] + "</td> " +
                "</tr>"
            );
        }
    }




    return {
        calculateStatistics : calculateStatistics
    };
})();