import React, { Component } from 'react';
import Section from './Section.jsx';

class Station extends React.Component {
    constructor(props) {
        super(props);
    }




    render() {
        let stations = this.props.station.map((station) => <Section key={station.id} station={station}/>);
        return (
                <div>
                {stations}
                </div>
        );
    }
}
export default Station;
