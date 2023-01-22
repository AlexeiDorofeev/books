import {useEffect, useState} from 'react';

function BooksList() {
    const [books, setBooks] = useState([]);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        fetch('http://localhost:8080/books')
            .then(response => response.json())
            .then(data => {
                setBooks(data);
                setLoading(false);
            });
    }, []);

    return (
        <div>
            {loading ? (
                <p>Loading...</p>
            ) : (
                <ul>
                    {books.map(book => (
                        <li key={book.id}>
                            {book.name} by {book.author}
                        </li>
                    ))}
                </ul>
            )}
        </div>
    );
}

export default BooksList;