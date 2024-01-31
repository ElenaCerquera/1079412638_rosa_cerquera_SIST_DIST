import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdicionarTareaComponent } from './adicionar-tarea.component';

describe('AdicionarTareaComponent', () => {
  let component: AdicionarTareaComponent;
  let fixture: ComponentFixture<AdicionarTareaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AdicionarTareaComponent]
    });
    fixture = TestBed.createComponent(AdicionarTareaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
