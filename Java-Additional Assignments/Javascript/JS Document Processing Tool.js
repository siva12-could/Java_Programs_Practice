<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document Processing Tool</title>
    <style>
        #documentInput {
            margin-left: 3%;
        }
        #findText {
            margin-left: 3%;
        }
        #countWords {
            margin-right: 12%;
        }
        #processedDocument {
            margin-top: 20px;
            text-align: center;
        }
    </style>
    <script>
        function count() {
            const documentInput = document.getElementById("documentInput").value;
            const findText = document.getElementById("findText").value;
            const replaceText = document.getElementById("replaceText").value;
            const countWord = document.getElementById("countWords").value;

            const replacedText = documentInput.split(findText).join(replaceText);
            const occurrenceCount = replacedText.split(countWord).length - 1;

            const processedDocument = document.getElementById("processedDocument");
            processedDocument.innerHTML = `
                <h1>Process Document</h1>
                <p>Document with Replaced Text: ${replacedText}</p>
                <p>Occurrences of "${countWord}": ${occurrenceCount}</p>
            `;
        }
    </script>
</head>
<body>
    <center>
        <h1>Document Processing Tool</h1>
        <div>
            <label>Enter Document</label>
            <textarea id="documentInput" placeholder="Type or paste your document here..." rows="3" cols="40"></textarea>
        </div>
        <br/>
        <div>
            <label>Find and Replace Text</label>
            <input id="findText" placeholder="Enter text to find">
            <input id="replaceText" placeholder="Enter text to replace">
        </div>
        <br>
        <div>
            <label>Count Occurrences of Word</label>
            <input id="countWords" placeholder="Enter word to count">
        </div>
        <br>
        <div>
            <button id="processDocument" onclick="count()">Process Document</button>
        </div>
        <br>
    </center>
    <div id="processedDocument"></div>
</body>
</html>
