import React, { Component } from 'react';
import Station from './Station.jsx'
import Station1 from './Station1.jsx'
import Section1 from './Section1.jsx'

class StationView extends React.Component {
    constructor(props) {
        super(props);
        this.loadStationFromServer=this.loadStationFromServer.bind(this);
         this.state = {
            station: []
        };
    }

    componentDidMount() {
        this.loadStationFromServer();
    }


    loadStationFromServer() {
        fetch('http://localhost:8080/sta1',
            {credentials: 'same-origin'})
            .then((response) => response.json())
            .then((responseData) => {
                this.setState({
                    station: responseData,
                });
            });
    }
    render() {
        return (
            <div>
                <Station1 station={this.state.station}/>
            </div>
        );
    }
}
export default StationView;
