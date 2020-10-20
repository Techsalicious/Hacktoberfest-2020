/**
 * In the first case, the bar is not declared. But in the second case, the bar is declared and defined to undefined.
 * Also, using obj.hasOwnProperty('bar') will give you false
 */

const obj = { foo: "foo" };
const obj2 = { foo: "foo", bar: undefined };

console.log(obj.bar); // undefined
console.log(obj2.bar); // undefined

console.log(obj); // { foo: 'foo' }
console.log(obj2); // { foo: 'foo', bar: undefined }

console.log(Object.keys(obj)); // ["foo"]
console.log(Object.keys(obj2)); // ["foo","bar"]

console.log(obj.hasOwnProperty("bar")); // false
console.log(obj2.hasOwnProperty("bar")); // true
