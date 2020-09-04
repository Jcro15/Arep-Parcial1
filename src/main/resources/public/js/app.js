var api = (function () {

    function calculateStatistics (){
        //var url='http://localhost:4567/calcular';
        var url='https://arep-parcial-rojas.herokuapp.com/calcular';
        var data=document.getElementById("data").value;
        $("#TData > tbody").empty();
        $("#mean").empty();
        $("#sum").empty();
        axios.post(url,data)
            .then(res => {
                let json = res.data;
                $("#mean").text("Media : "+json.media);
                $("#sum").text("Suma : "+json.sum);
                putData(json.list)

            }
        )
    }

    function putData(data){
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