function rbline() {
  var text = document.getElementById("text").value;
  text = text.replace(/(\r\n|\n|\r)/gm, " ");
  text = text.replace(/\s{2,}/g, " ");
  document.getElementById("hasil").value = text;
}
