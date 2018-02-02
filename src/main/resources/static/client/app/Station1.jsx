import React, { Component } from 'react';
import Section1 from './Section1.jsx';

class Station1 extends React.Component {
    constructor(props) {
        super(props);
    }




    render() {
        return (
            <div>
                <td>{this.props.station.name}</td>
                <Section1 station={this.props.station}/>
            </div>
        );
    }
}
export default Station1;
