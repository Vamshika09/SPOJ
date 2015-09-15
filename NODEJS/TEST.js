process.stdin.resume().setEncoding('utf8').on('data', function (chunk) {
  chunk.split('\n').forEach(function (line) {
    if (line === '42') {
      process.exit();
    }
    process.stdout.write(line + '\n');
  });
});
