import dayjs from 'dayjs/esm';

import { IEmployee, NewEmployee } from './employee.model';

export const sampleWithRequiredData: IEmployee = {
  id: 8899,
};

export const sampleWithPartialData: IEmployee = {
  id: 29906,
  firstName: 'Кондрат',
  lastName: 'Громов',
  email: 'Lidiya.Bogdanov74@yandex.ru',
  phoneNumber: 'sway',
  salary: 23343,
};

export const sampleWithFullData: IEmployee = {
  id: 19019,
  firstName: 'Самуил',
  lastName: 'Савельев',
  email: 'Cheslav54@gmail.com',
  phoneNumber: 'annex',
  hireDate: dayjs('2025-03-25T11:44'),
  salary: 24693,
  commissionPct: 15078,
};

export const sampleWithNewData: NewEmployee = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
