import React from 'react';
import Movies from './Movies';

export default class Example extends React.Component {
    render() {
        return (
            <div>
                <p>Hello {this.props.greeting}!</p>
                <Movies />
            </div>
        )
    }
}