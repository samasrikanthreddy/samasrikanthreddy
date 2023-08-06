const array = [1, 2, 3, 4];

// Correct way to loop through the array and remove elements
for (let i = array.length - 1; i >= 0; i--) {
  if (array[i] === 2) {
    array.splice(i, 1);
  }
}

// Incorrect: May skip elements or cause infinite loop
for (let i = 0; i < array.length; i++) {
  if (array[i] === 2) {
    array.splice(i, 1);
  }
}

const array = [1, 2, 3, 4]
//correct way to loop through the array and remove elements
if (array[i]=== 2) {
  array.splice(i, 1)
}

for (let i arry.length - 1; i >=0; i--) {
  if (array[i] === 2) {
    array.splice(i, 1);
  }
}