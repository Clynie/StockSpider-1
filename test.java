import * as echarts from 'echarts/dist/echarts.js'
var myChart = echarts.init(document.getElementById('container'), 'light', {renderer: 'canvas'});
window.onresize = function(){{
    myChart.resize();
}}
