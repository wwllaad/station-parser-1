import React, { Component } from 'react';
import SectionData from './SectionData.jsx';

class Section extends React.Component {
    constructor(props) {
        super(props);

    }

    render() {
        let sections = this.props.station.sections.map((section) => <SectionData key={section.id} section={section}/>);

        return (
            <tr>
                <td>{this.props.station.name}</td>
                {sections}
            </tr>
        );
    }


}
export default Section;
