document.addEventListener("DOMContentLoaded", function() {
    // Load the chart for the admin dashboard
    var ctx = document.getElementById('plansChart').getContext('2d');
    var plansChart = new Chart(ctx, {
        type: 'bar',
        data: {
            labels: ['Plan A', 'Plan B', 'Plan C'],
            datasets: [{
                label: 'Plans Purchased',
                data: [12, 19, 3],
                backgroundColor: 'rgba(229, 9, 20, 0.5)',
                borderColor: 'rgba(229, 9, 20, 1)',
                borderWidth: 1
            }]
        },
        options: {
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        }
    });
});
