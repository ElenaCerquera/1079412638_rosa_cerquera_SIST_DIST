import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TablatareasComponent } from './tablatareas.component';

describe('TablatareasComponent', () => {
  let component: TablatareasComponent;
  let fixture: ComponentFixture<TablatareasComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TablatareasComponent]
    });
    fixture = TestBed.createComponent(TablatareasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
