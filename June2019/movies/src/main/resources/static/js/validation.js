var noNegatives = document.getElementsByClassName('no-negative');

for (var negative in noNegatives){
    var negativeItem = noNegatives[negative];
    console.log(negativeItem);
    negativeItem.onchange = function(event) {
        var value = event.target.value;
        if (isNaN(value) || parseInt(value) < 1) {
            var el = document.createElement('span');
            el.innerHTML = 'Value must be greater than 0';
            console.log(negativeItem.parentNode);
            negativeItem.parentNode.appendChild(el);
        }
    }
}