/*
 * Copyright (C) 2016 acer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package sk.upjs.doctororganizer.Models;

import javax.swing.AbstractListModel;
import sk.upjs.doctororganizer.DAO.DoctorOfficeDao;
import sk.upjs.doctororganizer.Entities.DoctorOffice;
import sk.upjs.doctororganizer.Factory.DaoFactory;

public class OfficeListModel extends AbstractListModel<DoctorOffice> {

    DoctorOfficeDao dao;
    Long doctorId;

    public OfficeListModel(Long doctorId) {
        this.doctorId = doctorId;
        this.dao = DaoFactory.INSTANCE.getDoctorOfficeDao();
    }

    @Override
    public int getSize() {
        return dao.getByDoctorId(doctorId).size();
    }

    @Override
    public DoctorOffice getElementAt(int index) {
        return dao.getByDoctorId(doctorId).get(index);
    }

    public void refreshList() {
        fireContentsChanged(this, 0, getSize());
    }
    
}
