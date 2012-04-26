/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3tc1.impl;

import org.bimserver.models.ifc2x3tc1.IfcElement;
import org.bimserver.models.ifc2x3tc1.IfcOpeningElement;
import org.bimserver.models.ifc2x3tc1.IfcRelFillsElement;
import org.bimserver.models.ifc2x3tc1.LogPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Fills Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcRelFillsElementImpl#getRelatingOpeningElement <em>Relating Opening Element</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcRelFillsElementImpl#getRelatedBuildingElement <em>Related Building Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelFillsElementImpl extends IfcRelConnectsImpl implements IfcRelFillsElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelFillsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.IFC_REL_FILLS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOpeningElement getRelatingOpeningElement() {
		return (IfcOpeningElement) eGet(LogPackage.Literals.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingOpeningElement(IfcOpeningElement newRelatingOpeningElement) {
		eSet(LogPackage.Literals.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT, newRelatingOpeningElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatedBuildingElement() {
		return (IfcElement) eGet(LogPackage.Literals.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedBuildingElement(IfcElement newRelatedBuildingElement) {
		eSet(LogPackage.Literals.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT, newRelatedBuildingElement);
	}

} //IfcRelFillsElementImpl