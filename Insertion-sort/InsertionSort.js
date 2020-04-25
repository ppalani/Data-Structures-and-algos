/* Inserting sort algorithm */

function InsertionSort(A) {

	for (let j = 1; j < A.length; j++) {
		console.log(' be--- ' + j + '-----' + A);

		let key = A[j];
		let i = j - 1;

		while (i >= 0 && A[i] > key) {

			A[i + 1] = A[i];
			i--;

		}
		A[i + 1] = key;
		
		console.log(' ei--- ' + j + '-----' + A);
	}
	return A;
};

let B = [ 5, 2, 4, 6, 1, 3 ];


let d = [3, 5, 7, 8, 2, 3];

console.log('----original array---');

console.log(B);

console.log('----sorted array---');

console.log(InsertionSort(B));

console.log(InsertionSort(d));
