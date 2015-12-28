package randoop.test.predicate;

import randoop.ExceptionalExecution;
import randoop.sequence.ExecutableSequence;

/**
 * An exception predicate that always returns true.
 */
public class AlwaysTrueExceptionPredicate implements ExceptionPredicate {

  /**
   * {@inheritDoc}
   * @return true, always
   */
  @Override
  public boolean test(ExceptionalExecution exec, ExecutableSequence s) {
    return true;
  }

  /**
   * {@inheritDoc}
   * @return a predicate that always returns true
   */
  @Override
  public ExceptionPredicate or(ExceptionPredicate p) {
    return this;
  }

  /**
   * {@inheritDoc}
   * @return the second predicate, since this predicate is always true
   */
  @Override
  public ExceptionPredicate and(ExceptionPredicate p) {
    return p;
  }

  /**
   * {@inheritDoc}
   * @return a predicate that always returns false
   */
  @Override
  public ExceptionPredicate not() {
    return new AlwaysFalseExceptionPredicate();
  }

}
