import React, { Component } from 'react';


class SectionData extends React.Component {
    constructor(props) {
        super(props);

    }

    render() {

        return (
            <tr>
                <td>{this.props.section.name}</td>
                <td>{this.props.section.data}</td>
            </tr>
        );
    }


}
export default SectionData;
