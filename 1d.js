// Select all button elements
const buttons = document.querySelectorAll('button');

// Function to handle click event
function handleClick(event) {
  alert(`You clicked: ${event.target.textContent}`);
  console.log(`Button clicked: ${event.target.textContent}`);
}

// Add click event listener to each button
buttons.forEach(button => {
  button.addEventListener('click', handleClick);
});
