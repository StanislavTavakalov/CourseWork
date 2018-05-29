/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Swyatoslaw
 */
public class SubjectTest {

    @Test
    public void testCheckFail() {
        Activity a = new Subject(2017, null, Subject.Type.LECTURE, "name", null, 0, 0, Activity.WeekDay.TUESDAY);
        assertFalse(a.check());
    }

    @Test
    public void testCheckFail2() {
        Activity a = new Subject(2016, null, Subject.Type.LECTURE, "name", null, 0, 0, Activity.WeekDay.TUESDAY);
        assertFalse(a.check());
    }

    @Test
    public void testCheck() {
        Activity a = new Subject(2018, null, Subject.Type.LECTURE, "name", null, 0, 0, Activity.WeekDay.TUESDAY);
        assertTrue(a.check());
    }

    @Test
    public void testCheck2() {
        Activity a = new Subject(2019, null, Subject.Type.LECTURE, "name", null, 0, 0, Activity.WeekDay.TUESDAY);
        assertTrue(a.check());
    }

    @Test
    public void testCheck3() {
        Activity a = new Subject(2020, null, Subject.Type.LECTURE, "name", null, 0, 0, Activity.WeekDay.TUESDAY);
        assertTrue(a.check());
    }
}
