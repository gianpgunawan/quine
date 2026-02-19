let src=`let src=*
let res=""
for (const c of src) {
    res += (c.charCodeAt(0) == 42 ? String.fromCharCode(96) + src + String.fromCharCode(96): c);
}
console.log(res)
`
let res=""
for (const c of src) {
    res += (c.charCodeAt(0) == 42 ? String.fromCharCode(96) + src + String.fromCharCode(96): c);
}
console.log(res)

