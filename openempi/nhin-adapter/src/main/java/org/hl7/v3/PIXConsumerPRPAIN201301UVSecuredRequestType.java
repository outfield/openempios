/**
 *
 * Copyright (C) 2002-2012 "SYSNET International, Inc."
 * support@sysnetint.com [http://www.sysnetint.com]
 *
 * This file is part of OpenEMPI.
 *
 * OpenEMPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.hhs.fha.nhinc.common.nhinccommon.NhinTargetCommunitiesType;


/**
 * <p>Java class for PIXConsumer_PRPA_IN201301UVSecuredRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIXConsumer_PRPA_IN201301UVSecuredRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:hl7-org:v3}PRPA_IN201301UV02"/>
 *         &lt;element name="NhinTargetCommunities" type="{urn:gov:hhs:fha:nhinc:common:nhinccommon}NhinTargetCommunitiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIXConsumer_PRPA_IN201301UVSecuredRequestType", propOrder = {
    "prpain201301UV02",
    "nhinTargetCommunities"
})
public class PIXConsumerPRPAIN201301UVSecuredRequestType {

    @XmlElement(name = "PRPA_IN201301UV02", required = true)
    protected PRPAIN201301UV02 prpain201301UV02;
    @XmlElement(name = "NhinTargetCommunities")
    protected NhinTargetCommunitiesType nhinTargetCommunities;

    /**
     * Gets the value of the prpain201301UV02 property.
     * 
     * @return
     *     possible object is
     *     {@link PRPAIN201301UV02 }
     *     
     */
    public PRPAIN201301UV02 getPRPAIN201301UV02() {
        return prpain201301UV02;
    }

    /**
     * Sets the value of the prpain201301UV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRPAIN201301UV02 }
     *     
     */
    public void setPRPAIN201301UV02(PRPAIN201301UV02 value) {
        this.prpain201301UV02 = value;
    }

    /**
     * Gets the value of the nhinTargetCommunities property.
     * 
     * @return
     *     possible object is
     *     {@link NhinTargetCommunitiesType }
     *     
     */
    public NhinTargetCommunitiesType getNhinTargetCommunities() {
        return nhinTargetCommunities;
    }

    /**
     * Sets the value of the nhinTargetCommunities property.
     * 
     * @param value
     *     allowed object is
     *     {@link NhinTargetCommunitiesType }
     *     
     */
    public void setNhinTargetCommunities(NhinTargetCommunitiesType value) {
        this.nhinTargetCommunities = value;
    }

}
