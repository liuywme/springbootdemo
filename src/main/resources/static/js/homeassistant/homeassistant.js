$(function(){

    $("#turnOff").click(function(){
        alert("turnOff");
        var url = "http://10.107.102.244:8080/turnOff";
        $.ajax({
            url: url,
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            type: 'POST'
        }).done(function(data) {
            alert(data);
        });

    });

    $("#turnOn").click(function(){
        alert("turnOn");
        var url = "http://10.107.102.244:8080/turnOn";
        $.ajax({
            url: url,
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            type: 'POST'
        }).done(function(data) {
            alert(data);
        });
    });

});