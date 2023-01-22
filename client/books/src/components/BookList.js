import { useEffect, useState } from 'react';

function BooksList() {
    const [books, setBooks] = useState([]);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        fetch('http://localhost:8080/books')
            .then(response => response.json())
            .then(data => {
                console.log(data);
                setBooks(data);
                setLoading(false);
            });
    }, []);

    return (
        <div className="bg-amber-700">
            {loading ? (
                <p className="bg-amber-800 h-1/4">Loading...</p>
            ) : (
                <ul className="">
                    {books.map(book => (
                        <li key={book.id} className="bg-amber-600">
                            {book.name} by {book.author}
                        </li>
                    ))}
                </ul>
            )}
        </div>
    );
}

export default BooksList;