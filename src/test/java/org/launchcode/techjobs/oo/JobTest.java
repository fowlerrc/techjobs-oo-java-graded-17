package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());

        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().getValue());

        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().getValue());

        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().getValue());

        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        assertTrue(job.toString().endsWith(System.lineSeparator()));
        assertTrue(job.toString().startsWith(System.lineSeparator()));


    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        //Job job = new Job("Product tester", new Employer("ACME"), new Location());
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        String expected = System.lineSeparator() + "ID: " + job.getId() + System.lineSeparator() +
                "Name: " + job.getName() + System.lineSeparator() +
                "Employer: " + job.getEmployer() + System.lineSeparator() +
                "Location: " + job.getLocation() + System.lineSeparator() +
                "Position Type: " + job.getPositionType() + System.lineSeparator() +
                "Core Competency: " + job.getCoreCompetency() + System.lineSeparator();

        String actual = job.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = System.lineSeparator() + "ID: " + job.getId() + System.lineSeparator() +
                "Name: Data not available" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();

        String actual = job.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testSettingJobId() {
        Job job = new Job();
        Job job1 = new Job();

        assertNotEquals(job.getId(), job1.getId());
    }

    @Test
    public void  testJobsForEquality() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(job.getId(), job1.getId());
    }
}

