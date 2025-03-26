import { ILocation, NewLocation } from './location.model';

export const sampleWithRequiredData: ILocation = {
  id: 12482,
};

export const sampleWithPartialData: ILocation = {
  id: 30179,
  postalCode: 'wallaby',
  city: 'Нязепетровск',
};

export const sampleWithFullData: ILocation = {
  id: 22007,
  streetAddress: 'abseil given',
  postalCode: 'underneath emerge excluding',
  city: 'Камышлов',
  stateProvince: 'viciously duh against',
};

export const sampleWithNewData: NewLocation = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
