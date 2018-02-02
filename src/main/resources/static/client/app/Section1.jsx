import React, { Component } from 'react';
import SectionData1 from './SectionData1.jsx';

class Section1 extends React.Component {
    constructor(props) {
        super(props);

    }

    render() {

        if (!this.props.station.sections) {
            return (
                <div>
                    Loading....
                </div>
            )
        } else {
            let sections = this.props.station.sections.map((section) => <SectionData1 key={section.id}
                                                                                      section={section}/>);

            return (
                <tr>
                    {sections}
                </tr>
            );
        }
    }


}
export default Section1;
