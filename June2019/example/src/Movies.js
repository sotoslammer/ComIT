import React from 'react';
import axios from 'axios';

export default class Movies extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            movies: []
        }
    }

    componentDidMount() {
      axios.get('http://localhost:8080/rest-movie')
            .then(({ data }) => this.setState({movies: data}));
    }
    


    render() {
        return (
            <ul>
                {this.state.movies.map((movie, idx) => (<li key={idx}>{movie.title}</li>))}
            </ul>
        )
    }
}